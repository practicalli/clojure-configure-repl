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
