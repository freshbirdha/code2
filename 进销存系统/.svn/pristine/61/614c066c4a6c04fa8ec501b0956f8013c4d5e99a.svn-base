create database njue;
use njue;
/*MySQL数据库运行脚本*/
CREATE TABLE tb_customer(
	id char(10) primary key,
	customername varchar(50)  NOT NULL,
	zip char(6)  NULL,
	address varchar(50)  NULL,
	telephone varchar(20)  NULL,
	connectionperson varchar(20)  NULL,
	phone varchar(20)  NULL,
	bank varchar(50)  NULL,
	account varchar(50) NULL,
	email varchar(50)  NULL,
	fax varchar(20)  NULL, 
	available  int not null
);
CREATE TABLE tb_provider(
	id char(10) primary key,
	providername varchar(50)  NOT NULL,
	zip char(6)  NULL,
	address varchar(50)  NULL,
	telephone varchar(20)  NULL,
	connectionperson varchar(20)  NULL,
	phone varchar(20)  NULL,
	bank varchar(50)  NULL,
	account varchar(50) NULL,
	email varchar(50)  NULL,
	fax varchar(20)  NULL, 
	available int not null
);

CREATE TABLE tb_goods(
	id char(10) primary key,
	goodsname varchar(50) NOT NULL,
	produceplace varchar(50) NULL,
	size varchar(50) NULL,
	package varchar(50) NULL,
	productcode varchar(20) NULL,
	promitcode varchar(20) NULL,
	description varchar(50) NULL,
	price float NOT NULL,
	providerid char(10) NOT NULL,
	available  int not null,
       foreign key(providerid) REFERENCES tb_provider(id)
);

CREATE TABLE tb_sales(
	id char(20) primary key,
	customerid char(10) NOT NULL,
	paytype varchar(50) NOT NULL,
	salestime datetime NOT NULL,
	operateperson varchar(50) NOT NULL,
	number int NOT NULL,
	price float NOT NULL,
	comment varchar(100)NULL,
	goodsid char(10) NOT NULL,
	foreign key(customerid) references tb_customer(id),
	foreign key(goodsid) references tb_goods(id)
);

CREATE TABLE tb_salesback(
	id char(20) primary key,
	customerid char(10) NOT NULL,
	paytype varchar(50)NOT NULL,
	salesbacktime datetime NOT NULL,
	operateperson varchar(50)NOT NULL,
	number int NOT NULL,
	price float NOT NULL,
	comment varchar(100)NULL,
	goodsid char(10)NOT NULL,
	FOREIGN KEY(customerid) REFERENCES tb_customer (id),
	FOREIGN KEY(goodsid) REFERENCES tb_goods (id)
);

CREATE TABLE tb_inport(
	id char(20) primary key,
	providerid char(10) NOT NULL,
	paytype varchar(50) NOT NULL,
	inporttime datetime NOT NULL,
	operateperson varchar(50) NOT NULL,
	number int NOT NULL,
	price float NOT NULL,
	comment varchar(100) NULL,
	goodsid char(10) NOT NULL,
	FOREIGN KEY(goodsid) REFERENCES tb_goods (id),
	FOREIGN KEY(providerid) REFERENCES tb_provider (id)
);

CREATE TABLE tb_outport(
	id char(20) primary key,
	providerid char(10)  NOT NULL,
	paytype varchar(50)  NOT NULL,
	outporttime datetime NOT NULL,
	operateperson varchar(50)  NOT NULL,
	number int NOT NULL,
	price float NOT NULL,
	comment varchar(100)  NULL,
	goodsid char(10)  NOT NULL,
	FOREIGN KEY(goodsid) REFERENCES tb_goods (id),
	FOREIGN KEY(providerid) REFERENCES tb_provider(id)
);

CREATE TABLE tb_storagecheck(
	id int auto_increment primary key,
	goodsid char(10)  NOT NULL,
	number int NOT NULL,
	FOREIGN KEY(goodsid) REFERENCES tb_goods(id)
);

CREATE TABLE tb_operator(
	username varchar(20)  NOT NULL primary key,
	password varchar(20)  NOT NULL,
	name varchar(20)  NOT NULL,
	power char(10) NOT NULL
);
insert into tb_operator values ('admin','admin','shark','oper');
/*存储过程*/
DELIMITER $$

CREATE
    PROCEDURE `njue`.`pr_getAllProvider`()
    BEGIN
     select * from tb_provider where available!=0;
    END$$

DELIMITER ;

DELIMITER $$

CREATE
    PROCEDURE `njue`.`pr_getAllCustomer`()
    BEGIN
     select * from tb_customer where available!=0;
    END$$

DELIMITER ;

DELIMITER $$

CREATE
    PROCEDURE `njue`.`pr_getAllGoods`()
    BEGIN
     select * from tb_goods where available!=0;
    END$$

DELIMITER ;

DELIMITER $$

CREATE

    PROCEDURE `njue`.`pr_getAllSalesIn`()

    BEGIN
       select * from tb_sales;
    END$$

DELIMITER ;

DELIMITER $$

CREATE
    PROCEDURE `njue`.`pr_getAllSalesBack`()

    BEGIN
    select * from tb_salesback;
    END$$

DELIMITER ;

DELIMITER $$

CREATE

    PROCEDURE `njue`.`pr_getAllPortIn`()
    
    BEGIN
    select * from tb_inport;
    END$$

DELIMITER ;

DELIMITER $$

CREATE

    PROCEDURE `njue`.`pr_getAllPortOut`()
    
    BEGIN
    select * from tb_outport;
    END$$

DELIMITER ;

DELIMITER $$
CREATE

    PROCEDURE `njue`.`pr_getAllStorageGoods`()
     
    BEGIN
     select s.id,g.id as goodsid ,goodsname,produceplace,size,package,productcode,promitcode,description,price,providerid,number
     from tb_goods g,tb_storagecheck s 
     where g.available!=0 and g.id=s.id;
    END$$

DELIMITER ;

DELIMITER $$

CREATE

    PROCEDURE `pr_searchGoods`(a varchar(50),b varchar(50))
   
    BEGIN
     DECLARE v_sql varchar(200);
     set v_sql=concat('select * from tb_goods where ',a,'=\'',b,'\' and available=1');
     SET @sql = v_sql;
     PREPARE sl FROM @sql;
     EXECUTE sl;
     DEALLOCATE PREPARE sl;
    END$$

DELIMITER ;

DELIMITER $$

CREATE

    PROCEDURE `njue`.`pr_searchCustomer`(a varchar(50),b varchar(50))

    BEGIN
     DECLARE v_sql varchar(200);
     set v_sql=concat('select * from tb_customer where ',a,'=\'',b,'\' and available=1');
     SET @sql = v_sql;
     PREPARE sl FROM @sql;
     EXECUTE sl;
     DEALLOCATE PREPARE sl;
    END$$

DELIMITER ;

DELIMITER $$

CREATE

    PROCEDURE `njue`.`pr_searchProvider`(a varchar(50),b varchar(50))
    BEGIN
    DECLARE v_sql varchar(200);
     set v_sql=concat('select * from tb_provider where ',a,'=\'',b,'\' and available=1');
     SET @sql = v_sql;
     PREPARE sl FROM @sql;
     EXECUTE sl;
     DEALLOCATE PREPARE sl;
    END$$

DELIMITER ;

DELIMITER $$

CREATE
    PROCEDURE `njue`.`pr_searchSalesIn`(a varchar(50),b varchar(50))
    
    BEGIN
     DECLARE v_sql varchar(200);
     set v_sql=concat('select * from tb_sales where ',a,'=\'',b,'\'');
     SET @sql = v_sql;
     PREPARE sl FROM @sql;
     EXECUTE sl;
     DEALLOCATE PREPARE sl;
    END$$

DELIMITER ;

DELIMITER $$

CREATE

    PROCEDURE `njue`.`pr_searchSalesBack`(a varchar(50),b varchar(50))

    BEGIN
    DECLARE v_sql varchar(200);
     set v_sql=concat('select * from tb_salesback where ',a,'=\'',b,'\'');
     SET @sql = v_sql;
     PREPARE sl FROM @sql;
     EXECUTE sl;
     DEALLOCATE PREPARE sl;
    END$$

DELIMITER ;

DELIMITER $$

CREATE

    PROCEDURE `njue`.`pr_searchPortIn`(a varchar(50),b varchar(50))

    BEGIN
    DECLARE v_sql varchar(200);
     set v_sql=concat('select * from tb_inport where ',a,'=\'',b,'\'');
     SET @sql = v_sql;
     PREPARE sl FROM @sql;
     EXECUTE sl;
     DEALLOCATE PREPARE sl;
    END$$

DELIMITER ;

DELIMITER $$

CREATE

    PROCEDURE `njue`.`pr_searchPortOut`(a varchar(50),b varchar(50))

    BEGIN
     DECLARE v_sql varchar(200);
     set v_sql=concat('select * from tb_outport where ',a,'=\'',b,'\'');
     SET @sql = v_sql;
     PREPARE sl FROM @sql;
     EXECUTE sl;
     DEALLOCATE PREPARE sl;
    END$$

DELIMITER ;

DELIMITER $$
CREATE

    PROCEDURE `njue`.`pr_searchThroughTime`(a varchar(50),b varchar(50),c varchar(50),d varchar(50))
   
    BEGIN
    DECLARE v_sql varchar(200);
     set v_sql=concat('select * from ',a,' where ',b,' BETWEEN \'',c,'\' AND \'',d,'\'');
     SET @sql = v_sql;
     PREPARE sl FROM @sql;
     EXECUTE sl;
     DEALLOCATE PREPARE sl;
    END$$

DELIMITER ;

DELIMITER $$

CREATE
    PROCEDURE `njue`.`pr_changeGoodsNumber`(a varchar(50),b varchar(50))
  
    BEGIN
    set @goodsid=a;
    set @newnumber=b;
    set @oldnumber=(select number from tb_storagecheck where goodsid=@goodsid);
    UPDATE tb_storagecheck set number=@oldnumber+@newnumber where goodsid=@goodsid;
    END$$

DELIMITER ;