package androidx.recyclerview.widget;

/* loaded from: classes.dex */
interface StableIdStorage {

    public static class IsolatedStableIdStorage implements StableIdStorage {

        /* renamed from: a */
        public long f5653a = 0;

        public class WrapperStableIdLookup implements StableIdLookup {
        }
    }

    public static class NoStableIdStorage implements StableIdStorage {

        /* renamed from: androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage$1 */
        public class C05391 implements StableIdLookup {
        }
    }

    public static class SharedPoolStableIdStorage implements StableIdStorage {

        /* renamed from: androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage$1 */
        public class C05401 implements StableIdLookup {
        }
    }

    public interface StableIdLookup {
    }
}
