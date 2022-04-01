(let [num1 (do (Double/parseDouble (read-line)))] 
  (println "VOLUME =" (format "%.3f" (* (/ 4.0 3.0) 3.14159 num1 num1 num1))))
