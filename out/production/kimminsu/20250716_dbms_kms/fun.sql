SELECT CONCAT("java", "", "python");

SELECT 
	CONCAT(major_name, "", "홍길동")
FROM 
	major_mst
WHERE
	major_code = 2;
    
-- n번 부터 자르는 함수 
SELECT SUBSTRING("LAST DBMS", 3);

-- 특정 문자가 n번 등장할 때 부터 버리는 함수 
SELECT SUBSTRING_INDEX("test-last-dbms**1212", '-', 2);
SELECT SUBSTRING_INDEX("test-last-dbms**1212", '-', -1);

-- 길이 
SELECT LENGTH("hihi2323");

SELECT LOWER("Hello World");
SELECT UPPER("Hello World");

-- 공백을 없애는 함수 
SELECT TRIM("   abcdef   ");
-- 양쪽 지정된 문자열 제거 
SELECT TRIM(BOTH "a" FROM "abcde aaa dddaaaa");
-- 뒤쪽 지정된 문자열 제거
SELECT TRIM(TRAILING "a" FROM "abcde aaa dddaaaa");
-- 앞쪽 지정된 문자열 제거
SELECT TRIM(LEADING "a" FROM "abcde aaa dddaaaa");

SELECT REPLACE("It is Banana", "Banana", "Apple");

CREATE TABLE blacklist_mst (
	blacklist_code INT PRIMARY KEY AUTO_INCREMENT,
    student_code VARCHAR(10) NOT NULL
   ) ENGINE = INNODB;

CREATE TABLE student_mst2 (
	student_code INT PRIMARY KEY AUTO_INCREMENT,
	student_name VARCHAR(10) NOT NULL,
	school_name VARCHAR(10) NOT NULL
    )  ENGINE = INNODB ;
    
SELECT
	CONCAT(school_name, "",
    -- student_name
    CASE
		WHEN bl.student_code != 0
        THEN "블랙리스트"
        ELSE student_name
    END
    ) AS "result"
FROM
	student_mst sm
    LEFT OUTER JOIN school_mst scm ON(sm.school_code = scm.school_code)
	LEFT OUTER JOIN blacklist_mst bl ON(sm.school_code = bl.student_code);
    
--  문자열에서 해당 문자열이 처음 시작하는 위치반환
SELECT INSTR("abcddddpower", "power");

-- 왼쪽을 두번째 인수로 채우는 함수 
SELECT LPAD("banana", 10, "0");
SELECT RPAD("banana", 10, "0");
 
-- 왼쪽에서 두번째 인수만큼 남기고 자르기 
SELECT LEFT("banana", 4);
SELECT RIGHT("banana", 3);

SELECT MID("abcdedfghi", 5, 2);

-- 이진수 변환
SELECT BIN(31);
-- 8진수 
SELECT OCT(31);
-- 16진수
SELECT HEX(31);
-- 역정렬
SELECT REVERSE("123aabc32");
-- 두번째 인수만큼 반복 
SELECT REPEAT("gildong", 5);
-- 첫번째로 발견한 문자열의 위치를 반환
SELECT LOCATE("abc", "abcdefghijk");
-- 둘이 같다.
SELECT POSITION("gildong" IN "abcdefdsfsgildong123");
SELECT INSTR("abcdefdsfsgildong123","gildong");

-- 날짜 시간 
-- 냔도, 월, 일
SELECT CURDATE();
-- HH:MM:SS
SELECT CURTIME();
SELECT NOW();

-- 년도만 반환
SELECT YEAR('2025-08-11');
SELECT MONTH('2025-08-11');
SELECT DAYOFMONTH('2025-08-11');

SELECT ADDDATE('2025-08-11', INTERVAL 15 DAY);

SELECT ADDDATE('2025-08-11', INTERVAL 1 MONTH);

SELECT SUBDATE('2025-08-11', INTERVAL 15 DAY);
SELECT SUBDATE('2025-08-11', INTERVAL 1 MONTH);

SELECT DATEDIFF('2025-08-11', '2025-03-11');

SELECT DAYOFWEEK(NOW());

-- 숫자관련함수
SELECT SUM(student_year)
FROM student_mst;

SELECT AVG(student_year)
FROM student_mst;

-- 절댓값
SELECT ABS(-100);
-- 나머지
SELECT MOD(100, 3);
-- 지수
SELECT POW(2, 3);

