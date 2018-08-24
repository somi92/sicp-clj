(defn p [] (p))

(defn test [x y]
  (if (= x 0)
    0
    y))

;; using applicative order evaluation
;; this expression never terminates
;; (StackOverflow exception)
(test 0 (p))
