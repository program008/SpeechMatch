package main.java.regex;

/**
 * Copyright (c) 2017 The Android(kotlin) Open Source Project All rights reserved.
 * <p>
 * Created by tao.liu on 2017/8/16
 */

/*
  前后关联约束(前后预查)(***)

      4.1 ?=... 前置约束(存在)
      ?=... 前置约束(存在), 表示第一部分表达式必须跟在 ?=...定义的表达式之后.
      返回结果只瞒住第一部分表达式. 定义一个前置约束(存在)要使用 (). 在括号内部使用一个问号和等号: (?=...).
      前置约束的内容写在括号中的等号后面. 例如, 表达式 [T|t]he(?=\sfat) 匹配 The 和 the,
      在括号中我们又定义了前置约束(存在) (?=\sfat) ,即 The 和 the 后面紧跟着 (空格)fat.

      "[T|t]he(?=\sfat)" => The fat cat sat on the mat.
       通俗的说：匹配The或者the 后面紧跟(空格)fat的句子

       4.2 ?!... 前置约束-排除
       前置约束-排除 ?! 用于筛选所有匹配结果, 筛选条件为 其后不跟随着定义的格式 前置约束-排除 定义和
       前置约束(存在) 一样, 区别就是 = 替换成 ! 也就是 (?!...).
       表达式 [T|t]he(?!\sfat) 匹配 The 和 the, 且其后不跟着 (空格)fat.

       "[T|t]he(?!\sfat)" => The fat cat sat on the mat.
       通俗的说：匹配The或者the后不紧跟(空格)fat的句子


       4.3 ?<= ... 后置约束-存在
       后置约束-存在 记作(?<=...) 用于筛选所有匹配结果, 筛选条件为 其前跟随着定义的格式.
        例如, 表达式 (?<=[T|t]he\s)(fat|mat) 匹配 fat 和 mat, 且其前跟着 The 或 the.

       "(?<=[T|t]he\s)(fat|mat)" => The fat cat sat on the mat.
       通俗的说：匹配 fat 和 mat, 且其前跟着 The 或 the.

       4.4 ?<!... 后置约束-排除
       后置约束-排除 记作 (?<!...) 用于筛选所有匹配结果, 筛选条件为 其前不跟着定义的格式.
       例如, 表达式 (?<!(T|t)he\s)(cat) 匹配 cat, 且其前不跟着 The 或 the.

       "(?<![T|t]he\s)(cat)" => The cat sat on cat.
        通俗的说：匹配 cat, 且其前不跟着 The 或 the.
 */
public class RegexExp {
    public static void main(String[] args) {

    }

    /*
    额外补充

        正整数: ^\d+$
        负整数: ^-\d+$
        手机国家号: ^+?[\d\s]{3,}$
        手机号: ^+?[\d\s]+(?[\d\s]{10,}$
        整数: ^-?\d+$
        用户名: ^[\w\d_.]{4,16}$
        数字和英文字母: ^[a-zA-Z0-9]*$
        数字和英文字母和空格: ^[a-zA-Z0-9 ]*$
        密码: ^(?=^.{6,}$)((?=.*[A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z]))^.*$
        邮箱: ^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4})*$
        IP4 地址: ^((?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))*$
        纯小写字母: ^([a-z])*$
        纯大写字母: ^([A-Z])*$
        URL: ^(((http|https|ftp):\/\/)?([[a-zA-Z0-9]\-\.])+(\.)([[a-zA-Z0-9]]){2,4}([[a-zA-Z0-9]\/+=%&_\.~?\-]*))*$
        VISA 信用卡号: ^(4[0-9]{12}(?:[0-9]{3})?)*$
        日期 (MM/DD/YYYY): ^(0?[1-9]|1[012])[- /.](0?[1-9]|[12][0-9]|3[01])[- /.](19|20)?[0-9]{2}$
        日期 (YYYY/MM/DD): ^(19|20)?[0-9]{2}[- /.](0?[1-9]|1[012])[- /.](0?[1-9]|[12][0-9]|3[01])$
        MasterCard 信用卡号: ^(5[1-5][0-9]{14})*$
     */
}