package com.danielfireman.courses.map.isp;

/**
 * There is GuiController which handles clicks Button objects and window events from
 * a Window object. The problem with this design is that Button and Window both have a
 * Controller pointer. Button does need to call the onButton[X] methods of the controller
 * object but it also has access to the onWindow[X] methods which are useless to the button.
 * 
 * The presence of useless onWindow[X] methods is a violation of the ISP. There is also a cyclic
 * dependency, which is another hint that something is amiss.
 *
 * @see http://www.tomdalling.com/blog/software-design/solid-class-design-the-interface-segregation-principle/
 */
class Bad {
    private interface Button {
        void setController(GuiController controller);
    }

    private interface Window {
        void setController(GuiController controller);
    }

    private interface GuiController {
        void onButtonDown(Button button);
        void onButtonUp(Button button);
        void onWindowOpen(Button window);
        void onWindowClose(Window window);
        void onWindowMoved(Window window);
    }
}
