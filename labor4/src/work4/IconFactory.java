package work4;

import java.util.HashMap;
import java.util.Map;

/**
 * Клас IconFactory управляє створенням та зберіганням іконок.
 */
public class IconFactory {
    private Map<String, Icon> icons = new HashMap<>();

    public Icon getIcon(String type, boolean isFolder) {
        String key = isFolder ? "Folder:" + type : "File:" + type;
        if (!icons.containsKey(key)) {
            if (isFolder) {
                icons.put(key, new FolderIcon(type));
            } else {
                icons.put(key, new FileIcon(type));
            }
        }
        return icons.get(key);
    }
}