(ns clojure-chuck-norris-api.core
  (:gen-class)
  (:require [clj-http.client :as client]
            [cheshire.core :as json]))

(def url "https://api.chucknorris.io/jokes/random")

(defn get-joke []
  "Returns a random Chuck Norris joke."
  (let [response (client/get url)
        body (:body response)
        joke (json/parse-string body true)]
    (:value joke)))

(defn -main
  "Fetches and prints a random Chuck Norris joke."
  [& args]
  (println "Hello, World!")
  (println "Here's a joke for you:")
  (println (get-joke)))
