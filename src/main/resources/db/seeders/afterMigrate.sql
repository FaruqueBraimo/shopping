
-- Inserir Categoria por padrao
INSERT INTO categoria (id, nome) VALUES ('e8584db2-150b-4caf-a00c-7d30a585ce36', 'Sapato') ON CONFLICT (id, nome) DO NOTHING;
INSERT INTO categoria (id, nome) VALUES ('25e0eb05-b096-47cd-b14e-294f15adfeac', 'Chinelo')  ON CONFLICT (id, nome) DO NOTHING;;
INSERT INTO categoria (id, nome) VALUES ('297539e2-e189-4272-8ed5-a1599c588758', 'Bota') ON CONFLICT (id, nome) DO NOTHING;;
INSERT INTO categoria (id, nome) VALUES ('4aad2418-245f-4083-b315-5dc2e1f0631c', 'Tenis') ON CONFLICT (id, nome) DO NOTHING;;

-- Inserir Cor por padrao
INSERT INTO cor (id, nome) VALUES ('a47fe30e-b3d6-45c1-8b72-c5cb687732a3', 'Preto') ON CONFLICT (id, nome) DO NOTHING;;
INSERT INTO cor (id, nome) VALUES ('53e36f2b-8196-42a6-95ee-6464cb4d5ed5', 'Branco') ON CONFLICT (id, nome) DO NOTHING;;
INSERT INTO cor (id, nome) VALUES ('b9be5e3f-934a-4216-b96d-07f22d59ea6d', 'Azul') ON CONFLICT (id, nome) DO NOTHING;;


-- Inserir marca por padrao
INSERT INTO marca (id, nome) VALUES ('9bb8c91d-67c0-406d-a25b-70ccd015dc2b', 'Nike') ON CONFLICT (id, nome) DO NOTHING;;
INSERT INTO marca (id, nome) VALUES ('6e76e009-45f7-4c9a-8750-05db27f79b01', 'Adidas') ON CONFLICT (id, nome) DO NOTHING;;
INSERT INTO marca (id, nome) VALUES ('286da615-42fc-45b1-a8c5-c8666ca204c0', 'PUMA') ON CONFLICT (id, nome) DO NOTHING;;

