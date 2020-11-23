(ns exercise5)

(defn flast
  "Gets the last element of a given secuence."
  [x]
  (reduce (fn [a b] b) x)
)
