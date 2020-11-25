(ns exercise9
	 (:require [clojure.string :refer [lower-case split]]))

(defn word-count
  "Returns a map where each key is a distinct word in a given sentence and each value is the number of occurences of that word in the sentence."
  [x]
  (into {} (map (fn [[key value]] [key (count value)]) (group-by identity (map lower-case (split x #"\W+")))))
)
