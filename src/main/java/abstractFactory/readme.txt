抽象工厂方法不符合开闭原则（对拓展开放，对修改关闭）。
在本示例中，如果新建C风格的button和textField，与工厂方法一样，没什么问题。
如果添加新的，比如Label，那必须要添加新的方法，那就不符合开闭原则了。