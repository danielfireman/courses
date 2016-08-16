package com.danielfireman.courses.map.isp;

/**
 * The improved design above uses interfaces classes and (the good kind of) multiple inheritance.
 * Button now only has access to button related controller methods, and Window only has access to
 * window related controller methods, yet SomeController objects can be plugged into both.
 *
 * @see http://www.tomdalling.com/blog/software-design/solid-class-design-the-interface-segregation-principle/
 */
class Good {
    private interface ButtonController {
        void onButtonDown(Button button);
        void onButtonUp(Button button); 
    }
    private interface Button {
        void setController(ButtonController controller);
    }

    private interface WindowController {
        void onWindowOpen(Button window);
        void onWindowClose(Window window);
        void onWindowMoved(Window window);
    }
    private interface Window {
        void setController(WindowController controller);
    }

    private interface GuiController extends WindowController, ButtonController{}
}
