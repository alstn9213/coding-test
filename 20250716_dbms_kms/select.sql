CREATE TABLE school_mst (
	school_code INT PRIMARY KEY AUTO_INCREMENT,
	school_name VARCHAR(20) NOT NULL,
    school_date DATETIME,
    update_date DATETIME 
    ) ENGINE = INNODB;
    
INSERT INTO 
		school_mst
VALUES
    (0,
	"부산대학교",
    NOW(),
    NOW()
    ),
    (0,
    "부경대학교",
     NOW(),
     NOW()
    ),
    (0,
    "동아대학교",
     NOW(),
     NOW()
    ),(0,
    "경성대학교",
     NOW(),
     NOW()
    ),(0,
    "동명대학교",
     NOW(),
     NOW()
    ),
    (0,
    "부산외국어대학교", 
    NOW(),
    NOW()
    );
    
SELECT * FROM school_mst;

ALTER TABLE school_mst MODIFY COLUMN school_name VARCHAR(20) UNIQUE KEY;

SELECT school_name FROM school_mst;

SELECT school_code FROM school_mst WHERE school_name = '부산대학교';

/*
user_email 이 "kms@naver.com" 이 있는지 없는지 확인
*/

SELECT user_code FROM user_mst WHERE user_email = 'kms@naver.com';

SELECT * FROM school_mst WHERE school_name = '부산대학교' OR school_code = 1;

SELECT * FROM school_mst WHERE school_name = '부산대학교' AND school_code = 1;

SELECT * FROM school_mst WHERE school_name = '부산대학교' OR school_code = 1 ORDER BY school_date ASC;

CREATE TABLE major_mst (
	major_code INT PRIMARY KEY AUTO_INCREMENT,
	major_name VARCHAR(20) UNIQUE KEY NOT NULL,
	create_date DATETIME,
	update_date DATETIME
    ) ENGINE = INNODB;

INSERT INTO
		major_mst
VALUES (0,
		"컴퓨터공학과",
        NOW(),
        NOW()
        ), 
        (0,
		"전자공학과",
        NOW(),
        NOW()
        ),
        (0,
		"기계공학과",
        NOW(),
        NOW()
        ),
        (0,
		"화학공학과",
        NOW(),
        NOW()
        ),
         (0,
		"토목공학과",
        NOW(),
        NOW()
        ),
        (0,
		"국어국문학과",
        NOW(),
        NOW()
        ),
        (0,
		"영어영문학과",
        NOW(),
        NOW()
        ),
        (0,
		"유아교육하과",
        NOW(),
        NOW()
        ),
        (0,
		"경영학과",
        NOW(),
        NOW()
        ),
        (0,
		"정치외교학과",
        NOW(),
        NOW()
        );
        
SELECT * FROM major_mst;

SELECT major_name 
FROM major_mst;

SELECT major_name 
FROM major_mst 
ORDER BY major_name;

SELECT major_name 
FROM major_mst 
ORDER BY major_name DESC;


SELECT 
	major_code
FROM 
	major_mst 
WHERE 
	major_name 
IN 
	('정치외교학과', '유아교육하과', '기계공학과')
ORDER BY 
	major_name DESC;

----- LIKE
SELECT
	*
FROM 
	major_mst
WHERE
	major_name LIKE '%공학%';
    
CREATE TABLE student_mst (
	student_code INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(4) NOT NULL,
    student_year INT NOT NULL,
    school_code INT NOT NULL,
    major_code INT NOT NULL,
    create_date DATETIME,
    update_date DATETIME
    ) ENGINE= INNODB;

SELECT 
	*
FROM 
	student_mst
WHERE
	school_code = (
    SELECT 
		school_code
	FROM
		school_mst
	WHERE
		school_name = '부산대학교'
	);

    
SELECT 
	school_code
FROM
	school_mst
WHERE
	school_name = '부산대학교';

SELECT 
	*
FROM 
	student_mst AS sm
    LEFT OUTER JOIN school_mst AS scm ON(sm.school_code = scm.school_code);

SELECT 
	student_name, school_name
FROM 
	student_mst AS sm
	LEFT OUTER JOIN school_mst  AS scm ON (sm.school_code=scm.school_code)
    LEFT OUTER JOIN major_mst AS mm ON(sm.major_code = mm.major_code)
WHERE
	major_name IN ('전자공학과', '기계공학과', '화학공학과')
ORDER BY 
	school_name;
    
------------------------------------

SELECT 
	student_code,
    student_name, 
    student_year
FROM 
	student_mst
ORDER BY 
	student_year;
    
SELECT 
	school_name
FROM 
	school_mst AS scm
	LEFT OUTER JOIN student_mst AS sm ON(scm.school_code=sm.school_code)
WHERE
	student_code = 3;
    
-----------------------------

SELECT 
	major_code,
    major_name
FROM 
	major_mst
ORDER BY 
	create_date DESC;
    
SELECT 
	student_code AS '학번',
	student_name AS '이름',
    school_name AS '학교명'
FROM 
	student_mst AS sm
	LEFT OUTER JOIN school_mst  AS scm ON (sm.school_code=scm.school_code)
    LEFT OUTER JOIN major_mst AS mm ON(sm.major_code = mm.major_code)
WHERE 
	mm.major_code = 4;

    
SELECT 
	student_year
FROM 
	student_mst
WHERE
	student_code = 8;
-----------------

SELECT 
	school_name, 
    major_name, 
    student_name, 
    student_year
FROM 
	student_mst AS sm
    LEFT OUTER JOIN school_mst AS scm ON(sm.school_code=scm.school_code)
	LEFT OUTER JOIN major_mst AS mm ON(sm.major_code=mm.major_code)
WHERE 
	scm.school_name IN ('부산대학교', '동명대학교', '경성대학교') 
    OR mm.major_name = '%공학%'
ORDER BY 
	scm.school_name;
    






