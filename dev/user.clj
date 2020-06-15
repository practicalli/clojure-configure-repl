(ns user
  (:require [practicalli.configure-repl]))

(println "Message from user namespace")

(practicalli.configure-repl/-main "Loading a namespace and running the -main function")


;; Component life-cycle services
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(comment

  ;; Use the following code in user.clj
  ;; to load and switch to the `dev` namespace
  ;; which by convention is where services code is defined
  (ns user
    (:require [dev]))

  (in-ns 'dev)


  ) ;; End of comment block
