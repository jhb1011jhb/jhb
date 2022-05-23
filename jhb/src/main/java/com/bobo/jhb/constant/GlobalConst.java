package com.bobo.jhb.constant;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Set;

/**
 * @author liuchengbiao
 * @date 2020-06-21 13:33
 */
public interface GlobalConst {
    /**
     * 控制台
     */
    interface Console {
        /**
         * 控制台line
         */
        String LINE = "----------------------------------------";
    }

    /**
     * 编码
     */
    interface Charset {
        String UTF8 = "UTF-8";
    }

    /**
     * 扫描包
     */
    interface ScanPackage {
        /**
         * DAO扫描路径
         */
        String BASE_DAO = "com.gccloud.starter.**.dao";
        /**
         * 组件扫描路径，controller、service等
         */
        String BASE_COMPONENT = "com.gccloud.starter";
    }

    /**
     * 配置文件
     */
    interface ConfigFile {
        /**
         * 系统配置文件、用于自动生成时使用
         */
        List<String> SYS_CONFIG_FILE_NAME_LIST = Lists.newArrayList(
                "application-base.yml",
                "application-cas.yml",
                "application-druid-mysql.yml",
                "application-druid-oracle.yml",
                "application-druid-pg.yml",
                "application-mybatis-plus-mysql.yml",
                "application-mybatis-plus-oracle.yml",
                "application-mybatis-plus-pg.yml",
                "application.yml",
                "application-dev.yml",
                "application-prod.yml",
                "logback-spring.xml",
                "restart.sh",
                "stop.sh",
                "log.sh"
        );
    }

    /**
     * 删除标志位
     */
    interface DelFlag {
        /**
         * 删除
         */
        int DELETE = 1;
        /**
         * 未删除
         */
        int NOAMAL = 0;
    }

    /**
     * 业务字典
     */
    interface Dict {
        /**
         * 系统业务字典
         */
        interface Sys {
            /**
             * 日志类型
             */
            String LOG_TYPE = "LOG_TYPE";
        }

        /**
         * 业务字典状态
         */
        interface Status {
            /**
             * 正常
             */
            int NORMAL = 0;
            /**
             * 禁用
             */
            int FORBIDDEN = 1;
        }
    }

    /**
     * 业务字典项状态
     */
    interface DictItem {

        interface Status {
            /**
             * 正常
             */
            int NORMAL = 0;
            /**
             * 禁用
             */
            int FORBIDDEN = 1;
        }

        int DEFAULT_ORDER_NUM = 0;
    }


    /**
     * 系统日志常量
     */
    interface Log {
        /**
         * 日志状态
         */
        interface State {
            /**
             * 异常
             */
            int EXCEPTION = 1;
            /**
             * 正常
             */
            int NORMAL = 2;
        }

        /**
         * 日志类型
         */
        interface Type {
            /**
             * 新增
             */
            int INSERT = 1;
            /**
             * 删除
             */
            int DELETE = 2;
            /**
             * 更新
             */
            int UPDATE = 3;
            /**
             * 查询
             */
            int SELECT = 4;
            /**
             * 上传
             */
            int UPLOAD = 5;
            /**
             * 下载
             */
            int DOWNLOAD = 6;
            /**
             * 导入
             */
            int IMPORT = 7;
            /**
             * 导出
             */
            int EXPORT = 8;
            /**
             * 登录
             */
            int LOGIN = 9;
            /**
             * 登出
             */
            int LOGOUT = 10;
            /**
             * 其他
             */
            int OTHER = 11;
            /**
             * 注册
             */
            int REGISTER = 12;
        }
    }

    /**
     * 验证码
     */
    interface Captcha {
        /**
         * 类型
         */
        interface Type {
            /**
             * 动图
             */
            int GIF = 0;
            /**
             * 中文
             */
            int CHINESE = 1;
            /**
             * 中文动图
             */
            int CHINESE_GIF = 2;
            /**
             * 算术
             */
            int ARITHMETIC = 3;
            /**
             * 字符
             */
            int CHARACTER = 4;
        }
    }

    interface User {
        String SUPER_ADMIN_ID = "1";

        /**
         * 用户状态
         */
        interface Status {
            /**
             * 锁住
             */
            Integer LOCKED = 0;
            /**
             * 正常
             */
            Integer NORMAL = 1;
        }

        /**
         * 数据权限
         */
        interface DataPermission {
            /**
             * 自己的数据
             */
            int USER = 1;
            /**
             * 仅操作自己所属的机构的数据
             */
            int ORG = 2;
            /**
             * 仅操作自己所属的机构以及该机构的所有子机构数据
             */
            int ORG_AND_SON = 3;
            /**
             * 自定义机构数据
             */
            int ORG_CUSTOM = 4;
            /**
             * 所有数据
             */
            int ALL = 5;
        }

        /**
         * 事件类型
         */
        interface EventType {
            /**
             * 添加操作
             */
            int ADD = 1;
            /**
             * 更新操作
             */
            int UPDATE = 2;
            /**
             * 删除操作
             */
            int DELETE = 3;
            /**
             * 禁用
             */
            int LOCKED = 4;
            /**
             * 禁用恢复正常
             */
            int UN_LOCK = 5;
            /**
             * 修改密码
             */
            int UPDATE_PWD = 6;
            /**
             * 导入
             */
            int IMPORT = 7;
        }
    }

    interface Org {
        /**
         * 根机构
         */
        String SUPER_PARENT_ID = "0";
    }

    interface Menu {
        /**
         * 根菜单
         */
        String SUPER_PARENT_ID = "0";

        /**
         * 菜单打开方式
         */
        interface Target {
            /**
             * 内部打开
             */
            String SELF = "1";
            /**
             * 新窗口打开
             */
            String BLANK = "2";
        }

        /**
         * 类型
         */
        interface Type {
            /**
             * 目录
             */
            int CATALOG = 0;
            /**
             * 菜单
             */
            int MENU = 1;
            /**
             * 按钮
             */
            int BUTTON = 2;
        }
    }

    interface Role {
        /**
         * 超级管理员角色ID
         */
        String SUPER_ADMIN_ROLE_ID = "1";
    }

    /**
     * 定时任务
     */
    interface Schedule {
        /**
         * 类型
         */
        interface Type {
            /**
             * javaBean、利用反射创建对象并执行
             */
            Integer JAVA_BEAN = 1;
            /**
             * springBean、利用反射执行
             */
            Integer SPRING_BEAN = 2;
            /**
             * 调用接口
             */
            Integer HTTP = 3;
            /**
             * 函数
             */
            Integer FUNCTION = 4;
        }

        /**
         * Http类型
         */
        interface HttpType {
            /**
             * 同步请求
             */
            Integer SYNC = 1;
            /**
             * 异步请求
             */
            Integer ASYNC = 2;
        }

        /**
         * http方法
         */
        interface HttpMethod {
            /**
             * GET请求
             */
            Integer GET = 1;
            /**
             * POST请求
             */
            Integer POST = 2;
        }

        /**
         * 状态
         */
        interface Status {
            /**
             * 正常
             */
            int NORMAL = 0;
            /**
             * 暂停
             */
            int PAUSE = 1;
        }
    }

    /**
     * 实体字段常量
     */
    interface EntityField {
        /**
         * 机构ID
         */
        String ORG_ID = "orgId";
        /**
         * 创建者
         */
        String CREATE_BY = "createBy";
        /**
         * 创建时间
         */
        String CREATE_DATE = "createDate";
        /**
         * 更新者
         */
        String UPDATE_BY = "updateBy";
        /**
         * 更新时间
         */
        String UPDATE_DATE = "updateDate";
    }

    /**
     * 数据库字段
     */
    interface ColumnField {
        /**
         * 主键
         */
        String ID = "id";
        /**
         * 机构ID
         */
        String ORG_ID = "org_id";
        /**
         * 创建者
         */
        String CREATE_BY = "create_by";
        /**
         * 创建时间
         */
        String CREATE_DATE = "create_date";
        /**
         * 更新者
         */
        String UPDATE_BY = "update_by";
        /**
         * 更新时间
         */
        String UPDATE_DATE = "update_date";
    }

    /**
     * jwt
     */
    interface Jwt {
        /**
         * 用户ID
         */
        String USER_ID = "uid";
        /**
         * jwt的唯一标识
         */
        String ID = "id";
        /**
         * 账号
         */
        String USER_NAME = "uname";
        /**
         * 真实用户名
         */
        String REAL_NAME = "rname";
        /**
         * 机构ID
         */
        String ORG_ID = "oid";
        /**
         * 机构名称
         */
        String ORG_NAME = "oname";
        /**
         * 管理员
         */
        String SYS_MANAGER = "tm";
        /**
         * 数据类型
         */
        String DATA_PERMISSION_TYPE = "dpType";

        /**
         * 创建的时间戳，用于记录颁发的时间
         */
        String CREATE_TIME = "ctime";

        /**
         * 存储策略
         */
        enum StoreStrategy {
            /**
             * 无状态存储
             */
            NONE,
            /**
             * 进程内存储，也叫单节点
             */
            PROCESS,
            /**
             * 分布式存储
             * Distributed
             */
            DIS;
        }
    }

    /**
     * 响应
     */
    interface Response {
        /**
         * 响应码
         */
        interface Code {
            /**
             * 未登录
             */
            int NO_LOGIN = 401;
            /**
             * 无权限
             */
            int NO_ACCESS = 403;
            /**
             * 资源不存在
             */
            int NO_FOUNT = 404;
            /**
             * 服务端异常
             */
            int SERVER_ERROR = 500;
            /**
             * 成功
             */
            int SUCCESS = 200;
        }
    }

    interface Category {
        interface Status {
            /**
             * 正常
             */
            int NORMAL = 0;
            /**
             * 禁用
             */
            int FORBIDDEN = 1;
        }

        String SUPER_PARENT_ID = "0";
        int DEFAULT_ORDER_NUM = 0;
    }

    interface Logger {
        String DEFAULT_ROOT_PACKAGE_PREFFIX = "root";
        String LOGGER_DICT_CODE = "LOGGER";

        interface Status {
            /**
             * 正常
             */
            int NORMAL = 0;
            /**
             * 禁用
             */
            int FORBIDDEN = 1;
        }
    }

    /**
     * 系统设置
     */
    interface Setting {

        interface Key {
            /**
             * 注册时需要的角色编码集合
             */
            String REGIST_ROLE_ID_LIST = "regist.role.id.list";
            /**
             * 注册时需要的机构ID集合
             */
            String REGIST_ORG_ID = "regist.org.id";

            Set<String> SYS_SETTING_KEY_SET = Sets.newHashSet(REGIST_ROLE_ID_LIST, REGIST_ORG_ID);
        }
    }

    /**
     * 判重策略
     */
    enum RepeatStrategy {
        /**
         * 全局唯一
         */
        GLOBAL,
        /**
         * 用户下唯一
         */
        CREATE_BY,
        /**
         * 机构下唯一
         */
        ORG;
    }

    interface App {
        /**
         * 默认应用
         */
        interface Default {
            String id = "0";

            String name = "默认";
        }

        /**
         * 用户中心
         */
        interface UserCenter {
            String id = "1";

            String name = "用户中心";
        }

        interface Status {
            /**
             * 应用状态启用
             */
            String ENABLE = "0";

            /**
             * 应用状态禁用
             */
            String DISABLE = "1";
        }

        interface Permission {
            /**
             * 用户应用配置，仅访问权限
             */
            String VIEW = "1";

            /**
             * 用户应用配置，仅管理权限
             */
            String MANAGEMENT = "2";

            /**
             * 用户应用配置，访问和管理权限
             */
            String ALL_PERMISSION = "3";

        }
    }

    /**
     * 区域
     */
    interface Area {
        String SUPER_PARENT_ID = "0";
        int DEFAULT_ORDER_NUM = 0;
    }

    /**
     * 公告
     */
    interface Notice {
        /**
         * 草稿/在线/下线
         */
        String DRAFT = "DRAFT";
        String PUBLISH = "PUBLISH";
        String OFF = "OFF";
        String AUDITING = "AUDITING";
        String NOPASS = "NOPASS";
        /**
         * 置顶/取消置顶
         */
        int STICKUP = 1;
        int QUITUP = 0;
    }

    /**
     * 登录方式
     */
    interface LoginType {
        // 默认登录方式
        String DEFAULT = "DEFAULT";
        // 云认证 WEB端
        String CLOUD_OAUTH = "CLOUD_OAUTH";
        // 融合4A WEB端
        String OAUTH_4A = "OAUTH_4A";
        // 云认证 移动端
        String CLOUD_OAUTH_APP = "CLOUD_OAUTH_APP";
        // 融合4A 移动端
        String OAUTH_4A_APP = "OAUTH_4A_APP";
    }
}
