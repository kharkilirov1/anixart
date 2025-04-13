package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class Ref {

    public static final class BooleanRef implements Serializable {

        /* renamed from: b */
        public boolean f63347b;

        public String toString() {
            return String.valueOf(this.f63347b);
        }
    }

    public static final class ByteRef implements Serializable {
        public String toString() {
            return String.valueOf(0);
        }
    }

    public static final class CharRef implements Serializable {
        public String toString() {
            return String.valueOf((char) 0);
        }
    }

    public static final class DoubleRef implements Serializable {
        public String toString() {
            return String.valueOf(0.0d);
        }
    }

    public static final class FloatRef implements Serializable {

        /* renamed from: b */
        public float f63348b;

        public String toString() {
            return String.valueOf(this.f63348b);
        }
    }

    public static final class IntRef implements Serializable {

        /* renamed from: b */
        public int f63349b;

        public String toString() {
            return String.valueOf(this.f63349b);
        }
    }

    public static final class LongRef implements Serializable {

        /* renamed from: b */
        public long f63350b;

        public String toString() {
            return String.valueOf(this.f63350b);
        }
    }

    public static final class ObjectRef<T> implements Serializable {

        /* renamed from: b */
        public T f63351b;

        public String toString() {
            return String.valueOf(this.f63351b);
        }
    }

    public static final class ShortRef implements Serializable {
        public String toString() {
            return String.valueOf(0);
        }
    }
}
