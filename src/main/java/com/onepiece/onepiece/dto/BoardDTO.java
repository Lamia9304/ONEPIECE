package com.onepiece.onepiece.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;


@Data //lombok을 사용하기 때문에 getter,setter를 적어주지 않아도 됨
public class BoardDTO {

    /* TABLE CREATE문 */
//    CREATE TABLE "ONEPIECE"."CHAR_INFO"
//            (	"CHAR_ID" NUMBER(15,0) NOT NULL ENABLE,
//	"CHAR_GRP" VARCHAR2(20),
//	"CHR_NAME" VARCHAR2(20) NOT NULL ENABLE,
//	"CHAR_ALIAS" VARCHAR2(20),
//	"BIRTH_DE" DATE,
//            "CHR_AGE" VARCHAR2(5),
//	"CHR_HEIGHT" VARCHAR2(10),
//	"CHAR_BOUNTY" NUMBER(30,0),
//	"CHAR_HOME" VARCHAR2(20),
//	"CHAR_ABILITY" VARCHAR2(20),
//	"CHAR_BLNG" VARCHAR2(20) DEFAULT NULL
//   ) SEGMENT CREATION IMMEDIATE
//    PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
//    STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
//            PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
//    TABLESPACE "SYSTEM" ;


        private int CHAR_ID;
        private String CHAR_GRP;
        private String CHR_NAME;
        private Long  CHAR_BOUNTY;
        private String CHAR_ALIAS;
        private Date BIRTH_DE;
        private int CHR_AGE;
        private String CHR_HEIGHT;
        private String CHAR_HOME;
         private  String CHAR_ABILITY;
         private String CHAR_BLNG;
         private CodeDTO codeDTO;
    }