(defn my-alert []
  (js/alert "You clicked!"))

(set! (.-my_alert js/window) my-alert)
