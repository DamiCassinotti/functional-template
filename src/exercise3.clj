(ns exercise3)

(defn fibonacci
  "Calculates the fibonacci result fo the given input value."
  [x]
  (if (zero? x)
  	0
	(if (= x 1)
	  1
	  (+ (fibonacci (- x 1)) (fibonacci (- x 2)))
	)
  )
)
