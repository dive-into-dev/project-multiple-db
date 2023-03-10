CREATE TABLE "PROJECT_DB"."RESTAURANT" 
   (	"ID" NUMBER(19,0) NOT NULL ENABLE, 
	"NAME" VARCHAR2(255 CHAR), 
	"ADDRESS" VARCHAR2(255 CHAR), 
	 PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;