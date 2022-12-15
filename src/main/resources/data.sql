INSERT INTO PREGUNTAS (DESCRIPCION, TIPO) VALUES ('¿Te gusto el menú?', 'ABIERTA');
INSERT INTO PREGUNTAS (DESCRIPCION, TIPO) VALUES ('¿Nivel de satisfacción del servicio?', 'SEL_MULTIPLE');

INSERT INTO OPCIONES_PREGUNTA (OPCION, DESCRIPCION, PREGUNTA_ID) VALUES ('A', 'ALTO', SELECT ID FROM PREGUNTAS WHERE TIPO = 'SEL_MULTIPLE');
INSERT INTO OPCIONES_PREGUNTA (OPCION, DESCRIPCION, PREGUNTA_ID) VALUES ('B', 'MEDIO', SELECT ID FROM PREGUNTAS WHERE TIPO = 'SEL_MULTIPLE');
INSERT INTO OPCIONES_PREGUNTA (OPCION, DESCRIPCION, PREGUNTA_ID) VALUES ('C', 'BAJO', SELECT ID FROM PREGUNTAS WHERE TIPO = 'SEL_MULTIPLE');