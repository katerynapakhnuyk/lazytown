/*
 * This C++ source file was generated by the Gradle 'init' task.
 */
#ifndef SRC_H
#define SRC_H

#ifdef _WIN32
#define SRC_EXPORT_FUNC __declspec(dllexport)
#else
#define SRC_EXPORT_FUNC
#endif

#include <string>

namespace src {
    class Greeter {
        public:
        std::string SRC_EXPORT_FUNC greeting();
    };
}

#endif
