-- 스키마생성
CREATE DATABASE test_db_kms;

USE test_db_kms;

CREATE TABLE user_mst (
	user_code INT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(10) NOT NULL,
    user_email VARCHAR(50) NOT NULL,
    user_phone VARCHAR(20) NOT NULL,
    create_date DATETIME,
    update_date DATETIME
    ) ENGINE = INNODB;
    
    
-- 테이블 이름 변경
RENAME TABLE user_mst TO user_mst2;

-- 컬럼 추가
ALTER TABLE user_mst ADD COLUMN gender INT NOT NULL;

-- 컬럼 수정
ALTER TABLE user_mst MODIFY COLUMN gender INT NOT NULL AFTER user_phone;

/*
gender를 user_gender로 바꾸고 
NULL 허용으로 바꾸시오
위치를 user_email 뒤로 보내시오
create_date는 NOT NULL 추가
 
*/

-- 컬럼 변경
ALTER TABLE user_mst CHANGE gender user_gender INT;

ALTER TABLE user_mst MODIFY COLUMN user_gender INT AFTER user_email;
ALTER TABLE user_mst MODIFY COLUMN user_gender INT DEFAULT 0;
ALTER TABLE user_mst MODIFY COLUMN create_date DATETIME NOT NULL;

CREATE TABLE youtube_mst (
	youtube_code 		INT PRIMARY KEY AUTO_INCREMENT,
    youtube_title 		VARCHAR(100) NOT NULL,
    youtube_name 		VARCHAR(20) NOT NULL,
    youtube_mov_name	VARCHAR(200) NOT NULL,
	youtube_description 	VARCHAR(200) NOT NULL,
    youtube_view_count 		INT(100) NOT NULL,
    create_date  		DATETIME,
	update_date 		DATETIME
    
    ) ENGINE = INNODB;
    
ALTER TABLE youtube_mst ADD COLUMN youtube_tag VARCHAR(20) AFTER youtube_description;
ALTER TABLE youtube_mst MODIFY COLUMN youtube_view_count INT(10);

DROP TABLE youtube_mst;

INSERT INTO 
	youtube_mst(
		youtube_code, 
        youtube_title, 
		youtube_name, 
		youtube_mov_name,
		youtube_description,
		youtube_view_count,
		create_date,
		update_date 	
	)
VALUES(
	0,
    "잔잔한 음악2",
    "음악 유튜버2",
    "12.mov",
    "베토벤, 쇼팽, ...2",
    13,
    NOW(),
    NOW()
);


    
INSERT INTO 
	user_mst
VALUES(0,
    "gildong",
    "gildong@gmail.com",
    1,
    "010-1111-2222",
    NOW(),
    NOW()
	),
	(0,
    "gilseo",
    "gilseo@gmail.com",
    0,
    "010-3333-4444",
    NOW(),
    NOW()
	),
	(0,
    "gilnam",
    "gilnam@gmail.com",
    1,
    "010-5555-6666",
    NOW(),
    NOW()
	),
	(0,
    "gilbook",
    "gilbook@gmail.com",
    0,
    "010-7777-8888",
    NOW(),
    NOW()
);

SELECT 
	user_name,
    user_email
FROM
	user_mst;
    
SELECT 
	*
FROM
	user_mst;



    