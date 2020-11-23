(ns exercise6
  (:require [exercise4 :refer :all]))

(defn faverage
  "Calculates the average of a given sequence."
  [x]
  (/ (summary x) (summary (map (fn [a] 1) x)))
)
