(defn square [x]
  (* x x))

(defn sum-squares [x y]
  (+ (square x) (square y)))

(defn sum-squares-largest [x y z]
  (cond
    (and (> x z) (> y z)) (sum-squares x y)
    (and (> x y) (> z y)) (sum-squares x z)
    (and (> y x) (> z x)) (sum-squares y z)))

(sum-squares-largest 4 2 3)
