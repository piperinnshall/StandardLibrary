package base;
import java.util.*;

public final class _System$0 implements System$0{
  @Override public final Object mut$iso$0(){ return this; }
  @Override public final Object mut$close$0(){ return this; }
  public Object mut$try$0(){ return new _CapTry$0(); }
  public Object mut$out$0(){ return new _Output$0(); }
  public Object mut$inputCursor$0(){ return new _InputCursor$0(); }
  public Object mut$readLog$1(Object inMemLog){ 
    return new _LogReader$1((InMemoryLog$1)inMemLog,new ArrayList<Object>()); }
  public Object mut$assetRead$0(){ return new _AssetReadCapability$0(); }
}