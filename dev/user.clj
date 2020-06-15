(ns user
  (:require [practicalli.configure-repl]))

(println "Message from user namespace")

(practicalli.configure-repl/-main "Loading a namespace and running the -main function")
