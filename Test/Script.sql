--<ScriptOptions statementTerminator=";"/>
CREATE TABLE person (id INTEGER, name STRING);

INSERT INTO person values('123', 'ads');

UPDATE PATIENT SET PATIENT_TYPE = 'Outpatient' WHERE ID = 2;
ALTER TABLE patient ADD COLUMN PATIENT_TYPE TEXT;

CREATE TABLE PATIENT(
   ID INT PRIMARY KEY AUTOINCREMENT,
   NAME           TEXT      NOT NULL,
   ADDRESS        TEXT,
   COMPLAINT      TEXT,
   AMOUNT		  REAL,
   CONTACT		  INT,
   DOCTOR		  TEXT,
   ADMIT_DATE     TEXT,
   DIS_DATE       TEXT
);

UPDATE PATIENT SET NAME = '' 
				   ADDRESS = ''
				   COMPLAINT = ''
				   AMOUNT = ''
				   CONTACT = ''
				   DOCTOR = ''
				   ADMID_DATE = ''
				   DIS_DATE = ''
				   PATIENT_TYPE = ''
				   WHERE ID = 1;