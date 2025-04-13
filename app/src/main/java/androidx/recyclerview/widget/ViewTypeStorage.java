package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.List;

/* loaded from: classes.dex */
interface ViewTypeStorage {

    public static class IsolatedViewTypeStorage implements ViewTypeStorage {

        /* renamed from: a */
        public SparseArray<NestedAdapterWrapper> f5720a = new SparseArray<>();

        /* renamed from: b */
        public int f5721b = 0;

        public class WrapperViewTypeLookup implements ViewTypeLookup {
        }
    }

    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {

        /* renamed from: a */
        public SparseArray<List<NestedAdapterWrapper>> f5722a = new SparseArray<>();

        public class WrapperViewTypeLookup implements ViewTypeLookup {
        }
    }

    public interface ViewTypeLookup {
    }
}
