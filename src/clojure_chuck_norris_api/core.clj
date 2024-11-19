(ns clojure-chuck-norris-api.core
  (:gen-class)
  (:require [clojure-chuck-norris-api.cn-api :as api-reader]))

(defn -main [& args]
  (println (api-reader/get-joke))
  (println (api-reader/get-categories)))
