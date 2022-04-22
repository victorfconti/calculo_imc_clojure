(ns calculo-imc.core-test
  (:require [clojure.test :refer :all]
            [calculo-imc.core :refer :all]))

(deftest imc-test
  (testing "IMC 1"
    (is (= :baixo (calculo-imc 1 1))))
    (is (= :baixo (calculo-imc 41.4 1.5)))
    (is (= :baixo (calculo-imc 73.6 2)))
    (is (= :baixo (calculo-imc 18.4 1)))
    (is (= :baixo (calculo-imc 0 1.50)))
    (is (= :medio (calculo-imc 42 1.5)))
    (is (= :medio (calculo-imc 74 2)))
    (is (= :medio (calculo-imc 55.80 1.50)))
    (is (= :medio (calculo-imc 99.2 2)))
    (is (= :alto  (calculo-imc 56.025 1.50)))
    (is (= :alto  (calculo-imc 99.6 2)))
    (is (= :alto  (calculo-imc 222.75 1.5)))
    (is (= :alto  (calculo-imc 396 2)))
  )