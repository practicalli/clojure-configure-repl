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
;; Data Inspectors
;; Use djblue/portal as a tap source to inspect results of function calls

(comment

  (require '[portal.api :as inspect])

  ;; Start Portal inspector on REPL start

  ;; Open a portal inspector window
  (inspect/open)

  ;; Add portal as a tap> target
  (inspect/tap)

  ;; Clear all values in the portal inspector window
  (inspect/clear)

  ;; Close the inspector
  (inspect/close)

  ) ;; End of rich comment block

;; End of Data Inspectors
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Component life-cycle services

;; Practicalli Clojure Web Services has examples of using Integrant from a `user` namespace:
;; https://practical.li/clojure-web-services/repl-driven-development/integrant-repl/

;; End of Component life-cycle services
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
