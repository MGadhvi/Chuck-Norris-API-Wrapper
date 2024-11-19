(ns clojure-chuck-norris-api.cn-api
(:require [clj-http.client :as client]
          [cheshire.core :as json]))

(def url "https://api.chucknorris.io/jokes/")

(defn get-joke []
  "Returns a random Chuck Norris joke."
  (let [response (client/get (str url "random"))
        body (:body response)
        joke (json/parse-string body true)]
    (:value joke)))

(defn get-categories []
  "Returns a list of the possible joke categories"
  (json/parse-string (:body (client/get (str url "categories")))))
