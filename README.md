# Adapter_Pinos


Você foi contratado por uma fábrica que desenvolve um sistema de montagem baseado em pinos e buracos. Atualmente, existem dois tipos de pinos: **pinos redondos** e **pinos quadrados**. Os buracos redondos só aceitam pinos que sigam o formato redondo, enquanto os pinos quadrados não se encaixam diretamente.

Sua tarefa é criar uma estrutura que permita a adaptação dos pinos quadrados para que eles possam ser usados nos buracos redondos, sem modificar o comportamento dos pinos redondos ou dos buracos.

## Requisitos

1. Crie uma interface `PinoRedondo` com o método `getRaio()`.
2. Implemente a classe concreta `PinoRedondoConcreto` que representa um pino redondo.
3. Crie a classe `PinoQuadrado` que representa o pino quadrado com um atributo de largura.
4. Crie a classe adaptadora `AdaptadorPinoQuadrado` que:
   - Encapsula um `PinoQuadrado`.
   - Implementa a interface `PinoRedondo`, adaptando a largura do quadrado para um raio equivalente (fórmula: `raio equivalente = L * √2 / 2`).

5. Implemente a classe `BuracoRedondo`, que:
   - Aceita apenas pinos redondos.
   - Verifica se o pino pode se encaixar com base no raio.

6. Crie uma classe `Principal` para verificar:
   - Se os pinos redondos se encaixam nos buracos redondos.
   - Se os pinos quadrados podem ser adaptados para se encaixar também.

