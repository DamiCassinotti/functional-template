(ns exercise10)

(defrecord Account [balance])

(defn open-account []
  (Account. 0)
)

(defn get-balance [account]
  (:balance account)
)

(defn update-balance [account amount]
  (assoc account :balance (+ (:balance account) amount))
)

(defn close-account [account]
  (assoc account :balance nil)
)
