(ns sql-database-operations.core
  (:require
    [sql-database-operations.core :refer :all]
    [next.jdbc :as jdbc]
    [next.jdbc.result-set :as rs]))

(def db {:dbtype "h2" :dbname "example"})
(def ds (jdbc/get-datasource db))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

;; https://github.com/seancorfield/next-jdbc/blob/master/doc/getting-started.md
