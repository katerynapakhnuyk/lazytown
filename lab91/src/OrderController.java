
import com.example.inventory.model.Order;
import com.example.inventory.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public String listOrders(Model model) {
        model.addAttribute("orders", orderService.getAllOrders());
        return "orders";
    }

    @PostMapping("/orders")
    public String addOrder(Order order) {
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/deleteOrder")
    public String deleteOrder(Long id) {
        orderService.deleteOrder(id);
        return "redirect:/orders";
    }
}