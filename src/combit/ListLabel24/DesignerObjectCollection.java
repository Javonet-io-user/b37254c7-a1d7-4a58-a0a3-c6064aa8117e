package combit.ListLabel24;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.Collections.*;
import combit.ListLabel24.*;
import jio.System.*;

public class DesignerObjectCollection extends CollectionBase
    implements IList, ICollection, IEnumerable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.GetEnumerator();
  }
  /** SetProperty */

  public void set_Item(java.lang.Integer index, DesignerObject value) {
    try {
      javonetHandle.invoke("set_Item", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DesignerObject get_Item(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("get_Item", index);
      if (res == null) return null;
      return new DesignerObject((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DesignerObjectCollection() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DesignerObjectCollection");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DesignerObjectCollection(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer Add(DesignerObject value) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Add", value);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void AddRange(DesignerObject[] value) {
    try {
      javonetHandle.invoke("AddRange", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void AddRange(DesignerObjectCollection value) {
    try {
      javonetHandle.invoke("AddRange", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Contains(DesignerObject value) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Contains", value);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CopyTo(DesignerObject[] array, java.lang.Integer index) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array}, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer IndexOf(DesignerObject value) {
    try {
      java.lang.Integer res = javonetHandle.invoke("IndexOf", value);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void Insert(java.lang.Integer index, DesignerObject value) {
    try {
      javonetHandle.invoke("Insert", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public DesignerObjectCollection.DesignerObjectEnumerator GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return new DesignerObjectCollection.DesignerObjectEnumerator((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Remove(DesignerObject value) {
    try {
      javonetHandle.invoke("Remove", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public static class DesignerObjectEnumerator implements IEnumerator, Iterator<Object> {
    protected NObject javonetHandle;

    @Override
    public boolean hasNext() {
      return (java.lang.Boolean) this.MoveNext();
    }

    @Override
    public Object next() {
      return (Object) this.get_Current();
    }
    /** GetProperty */

    public DesignerObject getCurrent() {
      try {
        Object res = javonetHandle.<NObject>get("Current");
        if (res == null) return null;
        return new DesignerObject((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public DesignerObjectEnumerator(DesignerObjectCollection mappings) {
      try {
        javonetHandle =
            Javonet.New(
                "combit.ListLabel24.DesignerObjectCollection+DesignerObjectEnumerator", mappings);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public DesignerObjectEnumerator(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.Object Reset() {
      try {
        Object res =
            javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("Reset");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public java.lang.Object MoveNext() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IEnumerator")
                .invoke("MoveNext");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public Object get_Current() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IEnumerator")
                .invoke("get_Current");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
