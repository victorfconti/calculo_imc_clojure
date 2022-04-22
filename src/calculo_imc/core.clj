(ns calculo-imc.core)

(defn- calcula-valor-imc
  [peso, altura]
  (/ peso (* altura altura)))


(defn calculo-imc
  [peso altura]
  (let [imc (calcula-valor-imc peso altura)
        limite-imc-baixo 18.5
        limite-imc-medio 24.9]
    (if (< imc limite-imc-baixo)
      :baixo
      (if (< imc limite-imc-medio)
        :medio
        :alto
        ))))

