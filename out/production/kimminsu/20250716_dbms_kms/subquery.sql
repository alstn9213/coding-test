# 서브쿼리
SELECT 
	student_name,
		(
        SELECT
			COUNT(*)
		FROM
			student_mst
				) AS student_count
FROM 
	student_mst
WHERE
	major_code =
		(
			SELECT 
				major_code 
            FROM 
				major_mst 
            WHERE
				major_name = '컴퓨터공학과'
		);
        
-------
#limit문

SELECT 
	*
FROM 
	student_mst
LIMIT
	5, 10;
# a , b 
# a = (page -1)*n
# b = n
---------------------
#update문 

UPDATE 
	student_mst
SET
	student_name='홍길서'
WHERE
	student_code=1;
SELECT
	*
FROM
	student_mst;
-------------------------
/* 회원정보 수정
회원코드와 이름을 요청 보내서 회원이 존재하는지 확인하시오
회원이 존재하면 회원의 이름, 학년, 학교명, 전공명 보여주시오
전공을 '화학공학과'로 바꾸시오
*/

SELECT 
	*
FROM 
	student_mst
WHERE
	student_code = 2
    AND
    student_name = '홍길2';
    
SELECT 
	student_name,
    student_year,
    school_name,
    major_name
FROM
	student_mst AS sm
    LEFT OUTER JOIN school_mst AS scm ON(sm.school_code=scm.school_code)
    LEFT OUTER JOIN major_mst AS mm ON(sm.major_code=mm.major_code)
WHERE
	student_code = 2
    AND
    student_name = '홍길2';
    
------- 비교연산자 '='를 할당연산자로 바꿔 값을 대입하는 SET
UPDATE
	student_mst
SET
	major_code = 
    (
		SELECT
			major_code
		FROM 
			major_mst
		WHERE
			major_name = '화학공학과'
            )
WHERE
	student_code = 2
    AND
    student_name = '홍길2';
SELECT 
	*
FROM 
	student_mst;
    
SELECT
	*
FROM 
	youtube_mst;
    
UPDATE
	youtube_mst
SET
	youtube_view_count = youtube_view_count + 1
WHERE
	youtube_code = 1;

----- DELETE 문

DELETE 
FROM
	student_mst
WHERE
	student_code = 13;
    
----- CASE문
SELECT 
	student_name,
	CASE 
		WHEN student_year = 1
        THEN '해당'
        WHEN student_year > 1
        THEN '미해당'
	END '검사'
		FROM 
			student_mst;
    
 ------ # LENGTH 함수 
 
SELECT 
	LENGTH(youtube_mov_name)
FROM
	youtube_mst;

/*
유튜브 태그값 수정
#음악 #라이브 # 잠잘때듣는노래 #숙면 #잠안올때 
#재즈 #피아노 #밤

태그값의 길이가 10을 넘어가면 장문태그, 작으면 단문태그로 출력
*/

UPDATE 
	youtube_mst
SET
	youtube_tag = '#음악 #라이브 # 잠잘때듣는노래 #숙면 #잠안올때'
WHERE
	youtube_code = 1;
    
UPDATE 
	youtube_mst
SET
	youtube_tag = '#재즈 #피아노 #밤'
WHERE
	youtube_code = 2;
    
SELECT
	youtube_code,
    youtube_title,
    youtube_name,
	CASE 
		WHEN LENGTH(youtube_tag) > 10
        THEN '장문태그'
		WHEN LENGTH(youtube_tag) <= 10
        THEN '단문태그'
	END AS '태그유형'
FROM 
	youtube_mst;

UPDATE
	youtube_mst
SET
	youtube_like = CASE
						WHEN youtube_like = 0 
                        THEN 1 
                        ELSE 0
					END 
WHERE 
	youtube_code = 1;
    
/*
user2_mst
user_code
user_name
user_pw

user2_dtl
user_codeuser_mst
user_img_path
user_age
user_profile
*/

CREATE TABLE user2_mst (			
						user_code INT AUTO_INCREMENT PRIMARY KEY,
                        user_name VARCHAR(10) NOT NULL,
                        user_pw INT NOT NULL
                        );
CREATE TABLE user2_dtl (			
						user_code INT AUTO_INCREMENT PRIMARY KEY,
                        user_img_path VARCHAR(10),
                        user_age INT NOT NULL,
                        user_profile VARCHAR(50) 
                        );
            
	