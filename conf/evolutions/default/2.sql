
# --- !Ups

INSERT INTO t_post
(
  name,
  title,
  message,
  created_at
)
VALUES
(
  '高海 千歌',
  'sample tile1',
  'みかん！',
  TIMESTAMP'1900-01-01 00:00:00'
),
(
  '桜内 梨子',
  'sample tile2',
  'ゆでたまご・サンドイッチ',
  TIMESTAMP'1900-01-01 00:00:00'
),
(
  '松浦 果南',
  'sample tile3',
  'さざえ・わかめ',
  TIMESTAMP'1900-01-01 00:00:00'
),
(
  '黒澤 ダイヤ',
  'sample tile4',
  '抹茶味のお菓子・プリン',
  TIMESTAMP'1900-01-01 00:00:00'
),
(
  '渡辺 曜',
  'sample tile5',
  'ハンバーグ・みかん',
  TIMESTAMP'1900-01-01 00:00:00'
),
(
  '津島 善子',
  'sample tile6',
  'チョコレート・苺',
  TIMESTAMP'1900-01-01 00:00:00'
),
(
  '国木田 花丸',
  'sample tile7',
  'みかん・あんこ',
  TIMESTAMP'1900-01-01 00:00:00'
),
(
  '小原 鞠莉',
  'sample tile8',
  'コーヒー・レモン',
  TIMESTAMP'1900-01-01 00:00:00'
),
(
  '黒澤 ルビィ',
  'sample tile9',
  'ポテトフライ・スイートポテト',
  TIMESTAMP'1900-01-01 00:00:00'
);


# --- !Downs

delete from t_post;
