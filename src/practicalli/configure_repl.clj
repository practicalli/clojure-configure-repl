(ns practicalli.configure-repl
  (:gen-class)
  (:require [clojure.string :as string]))

(defn -main
  "A welcoming message which takes an optional number of arguments"
  [& args]
  (println "Hello, World! " (string/join " " args )))
