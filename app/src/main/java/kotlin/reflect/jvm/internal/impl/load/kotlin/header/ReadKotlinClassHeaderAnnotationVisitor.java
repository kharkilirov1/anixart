package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

    /* renamed from: j */
    public static final boolean f64835j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: k */
    public static final Map<ClassId, KotlinClassHeader.Kind> f64836k;

    /* renamed from: a */
    public int[] f64837a = null;

    /* renamed from: b */
    public JvmBytecodeBinaryVersion f64838b = null;

    /* renamed from: c */
    public String f64839c = null;

    /* renamed from: d */
    public int f64840d = 0;

    /* renamed from: e */
    public String f64841e = null;

    /* renamed from: f */
    public String[] f64842f = null;

    /* renamed from: g */
    public String[] f64843g = null;

    /* renamed from: h */
    public String[] f64844h = null;

    /* renamed from: i */
    public KotlinClassHeader.Kind f64845i = null;

    public static abstract class CollectStringArrayAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

        /* renamed from: a */
        public final List<String> f64846a = new ArrayList();

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* renamed from: a */
        public void mo32902a() {
            List<String> list = this.f64846a;
            mo32955e((String[]) list.toArray(new String[list.size()]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* renamed from: b */
        public void mo32903b(@Nullable Object obj) {
            if (obj instanceof String) {
                this.f64846a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* renamed from: c */
        public void mo32904c(@NotNull ClassId classId, @NotNull Name name) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* renamed from: d */
        public void mo32905d(@NotNull KotlinJvmBinaryClass.ClassLiteralId classLiteralId) {
        }

        /* renamed from: e */
        public abstract void mo32955e(@NotNull String[] strArr);
    }

    public class KotlinMetadataArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public KotlinMetadataArgumentVisitor(C66391 c66391) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* renamed from: a */
        public void mo32895a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* renamed from: b */
        public void mo32896b(@Nullable Name name, @Nullable Object obj) {
            if (name == null) {
                return;
            }
            String str = name.f65606b;
            if ("k".equals(str)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
                    int intValue = ((Integer) obj).intValue();
                    KotlinClassHeader.Kind kind = (KotlinClassHeader.Kind) ((LinkedHashMap) KotlinClassHeader.Kind.f64833j).get(Integer.valueOf(intValue));
                    if (kind == null) {
                        kind = KotlinClassHeader.Kind.UNKNOWN;
                    }
                    readKotlinClassHeaderAnnotationVisitor.f64845i = kind;
                    return;
                }
                return;
            }
            if ("mv".equals(str)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f64837a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("bv".equals(str)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f64838b = new JvmBytecodeBinaryVersion((int[]) obj);
                    return;
                }
                return;
            }
            if ("xs".equals(str)) {
                if (obj instanceof String) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f64839c = (String) obj;
                    return;
                }
                return;
            }
            if ("xi".equals(str)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f64840d = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(str) && (obj instanceof String)) {
                ReadKotlinClassHeaderAnnotationVisitor.this.f64841e = (String) obj;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* renamed from: c */
        public void mo32897c(@NotNull Name name, @NotNull ClassId classId, @NotNull Name name2) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* renamed from: d */
        public void mo32898d(@NotNull Name name, @NotNull KotlinJvmBinaryClass.ClassLiteralId classLiteralId) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* renamed from: e */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo32899e(@NotNull Name name, @NotNull ClassId classId) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* renamed from: f */
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo32900f(@NotNull Name name) {
            String str = name.f65606b;
            if ("d1".equals(str)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinMetadataArgumentVisitor.1
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    /* renamed from: e */
                    public void mo32955e(@NotNull String[] strArr) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.f64842f = strArr;
                    }
                };
            }
            if ("d2".equals(str)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinMetadataArgumentVisitor.2
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    /* renamed from: e */
                    public void mo32955e(@NotNull String[] strArr) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.f64843g = strArr;
                    }
                };
            }
            return null;
        }
    }

    public class OldDeprecatedAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public OldDeprecatedAnnotationArgumentVisitor(C66391 c66391) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* renamed from: a */
        public void mo32895a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* renamed from: b */
        public void mo32896b(@Nullable Name name, @Nullable Object obj) {
            if (name == null) {
                return;
            }
            String str = name.f65606b;
            if (!"version".equals(str)) {
                if ("multifileClassName".equals(str)) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f64839c = obj instanceof String ? (String) obj : null;
                    return;
                }
                return;
            }
            if (obj instanceof int[]) {
                ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
                int[] iArr = (int[]) obj;
                readKotlinClassHeaderAnnotationVisitor.f64837a = iArr;
                if (readKotlinClassHeaderAnnotationVisitor.f64838b == null) {
                    readKotlinClassHeaderAnnotationVisitor.f64838b = new JvmBytecodeBinaryVersion(iArr);
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* renamed from: c */
        public void mo32897c(@NotNull Name name, @NotNull ClassId classId, @NotNull Name name2) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* renamed from: d */
        public void mo32898d(@NotNull Name name, @NotNull KotlinJvmBinaryClass.ClassLiteralId classLiteralId) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* renamed from: e */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo32899e(@NotNull Name name, @NotNull ClassId classId) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* renamed from: f */
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo32900f(@NotNull Name name) {
            String str = name.f65606b;
            if ("data".equals(str) || "filePartClassNames".equals(str)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.OldDeprecatedAnnotationArgumentVisitor.1
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    /* renamed from: e */
                    public void mo32955e(@NotNull String[] strArr) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.f64842f = strArr;
                    }
                };
            }
            if ("strings".equals(str)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.OldDeprecatedAnnotationArgumentVisitor.2
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    /* renamed from: e */
                    public void mo32955e(@NotNull String[] strArr) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.f64843g = strArr;
                    }
                };
            }
            return null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f64836k = hashMap;
        FqName fqName = new FqName("kotlin.jvm.internal.KotlinClass");
        hashMap.put(new ClassId(fqName.m33198c(), fqName.m33199d()), KotlinClassHeader.Kind.CLASS);
        FqName fqName2 = new FqName("kotlin.jvm.internal.KotlinFileFacade");
        hashMap.put(new ClassId(fqName2.m33198c(), fqName2.m33199d()), KotlinClassHeader.Kind.FILE_FACADE);
        FqName fqName3 = new FqName("kotlin.jvm.internal.KotlinMultifileClass");
        hashMap.put(new ClassId(fqName3.m33198c(), fqName3.m33199d()), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        FqName fqName4 = new FqName("kotlin.jvm.internal.KotlinMultifileClassPart");
        hashMap.put(new ClassId(fqName4.m33198c(), fqName4.m33199d()), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        FqName fqName5 = new FqName("kotlin.jvm.internal.KotlinSyntheticClass");
        hashMap.put(new ClassId(fqName5.m33198c(), fqName5.m33199d()), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    /* renamed from: a */
    public void mo32892a() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    @Nullable
    /* renamed from: b */
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo32893b(@NotNull ClassId classId, @NotNull SourceElement sourceElement) {
        KotlinClassHeader.Kind kind;
        if (classId.m33189a().equals(JvmAnnotationNames.f64348a)) {
            return new KotlinMetadataArgumentVisitor(null);
        }
        if (f64835j || this.f64845i != null || (kind = (KotlinClassHeader.Kind) ((HashMap) f64836k).get(classId)) == null) {
            return null;
        }
        this.f64845i = kind;
        return new OldDeprecatedAnnotationArgumentVisitor(null);
    }
}
