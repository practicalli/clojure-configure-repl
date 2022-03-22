(ns user
  (:require [practicalli.configure-repl]))

(println "Message from user namespace")

(practicalli.configure-repl/-main "Calling the -main function from the required namespace...")

;; Namespace switching via user namespace will be superseded by the REPL startup process
;; switching to `user` namespace before displaying the REPL prompt

(comment

  ;; Manually call in-ns to switch to the main namespace
  (in-ns 'practicalli.configure-repl)

  ) ;; End of comment block



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(comment





;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Component life-cycle services

;; Practicalli Clojure Web Services has examples of using Integrant from a `user` namespace:
;; https://practical.li/clojure-web-services/repl-driven-development/integrant-repl/

;; End of Component life-cycle services
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
