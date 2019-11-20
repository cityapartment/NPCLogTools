1. Log tools Init

2. Log Interface

=================================

3. Log write

4. Log save

=================================

5. Log read

6. Log compress

7. Log Upload

=================================

8. Log Handler Result


类型：
ALL, APPLOG, USERLOG

APPLOG:
LEVEL:
ERROR，EXCEPTION, WARNING, INFO, ALL
CATEGORY:
AppSystem, AppPerform, AppRuntime(AppView/AppEngineer/AppBusiness/AppDB), AppNetwork/AppRequest,

USERLOG:
LEVEL:
COMMON, SPECIAL
CATEGORY:
AppBehavior, AppDeviceInfo


AppPerform:
记录 App 的电量使用情况、流量使用、内存使用、启动速度
AppSystem:
App 的闪退情况、卡死、卡顿

DATABASE CREATE:
DB/File
applog, userlog

应用层：
 Native, H5(JSBridge), 自动埋点

日志SDK：
 初始化
 接口（接收传入埋点参数，公共参数）
 日志格式化，
 限流控制（配置）
 日志存档(写入文件, 数据库，打印)，

压缩/读取，
上传日志接口，
结果处理，
清理本次日志，
