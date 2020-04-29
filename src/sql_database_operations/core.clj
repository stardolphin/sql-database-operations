(ns sql-database-operations.core
  (:require
    [sql-database-operations.core :refer :all]
    [[next.jdbc :as jdbc]]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
