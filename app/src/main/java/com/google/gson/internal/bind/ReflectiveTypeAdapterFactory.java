package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: b */
    public final ConstructorConstructor f23799b;

    /* renamed from: c */
    public final FieldNamingStrategy f23800c;

    /* renamed from: d */
    public final Excluder f23801d;

    /* renamed from: e */
    public final JsonAdapterAnnotationTypeAdapterFactory f23802e;

    /* renamed from: f */
    public final ReflectionAccessor f23803f = ReflectionAccessor.f23871a;

    public static final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a */
        public final ObjectConstructor<T> f23810a;

        /* renamed from: b */
        public final Map<String, BoundField> f23811b;

        public Adapter(ObjectConstructor<T> objectConstructor, Map<String, BoundField> map) {
            this.f23810a = objectConstructor;
            this.f23811b = map;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public T mo12837b(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo12898C() == JsonToken.NULL) {
                jsonReader.mo12915v();
                return null;
            }
            T mo12866a = this.f23810a.mo12866a();
            try {
                jsonReader.mo12901b();
                while (jsonReader.mo12905j()) {
                    BoundField boundField = this.f23811b.get(jsonReader.mo12912q());
                    if (boundField != null && boundField.f23814c) {
                        boundField.mo12932a(jsonReader, mo12866a);
                    }
                    jsonReader.mo12899Z();
                }
                jsonReader.mo12904h();
                return mo12866a;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new JsonSyntaxException(e3);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void mo12838c(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.mo12923k();
                return;
            }
            jsonWriter.mo12919c();
            try {
                for (BoundField boundField : this.f23811b.values()) {
                    if (boundField.mo12934c(t)) {
                        jsonWriter.mo12922i(boundField.f23812a);
                        boundField.mo12933b(jsonWriter, t);
                    }
                }
                jsonWriter.mo12921h();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public static abstract class BoundField {

        /* renamed from: a */
        public final String f23812a;

        /* renamed from: b */
        public final boolean f23813b;

        /* renamed from: c */
        public final boolean f23814c;

        public BoundField(String str, boolean z, boolean z2) {
            this.f23812a = str;
            this.f23813b = z;
            this.f23814c = z2;
        }

        /* renamed from: a */
        public abstract void mo12932a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: b */
        public abstract void mo12933b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: c */
        public abstract boolean mo12934c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f23799b = constructorConstructor;
        this.f23800c = fieldNamingStrategy;
        this.f23801d = excluder;
        this.f23802e = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // com.google.gson.TypeAdapterFactory
    /* renamed from: a */
    public <T> com.google.gson.TypeAdapter<T> mo12853a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m12931b(java.lang.reflect.Field r6, boolean r7) {
        /*
            r5 = this;
            com.google.gson.internal.Excluder r0 = r5.f23801d
            java.lang.Class r1 = r6.getType()
            boolean r2 = r0.m12868c(r1)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L17
            boolean r1 = r0.m12867b(r1, r7)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            if (r1 != 0) goto L63
            int r1 = r6.getModifiers()
            r1 = r1 & 136(0x88, float:1.9E-43)
            if (r1 == 0) goto L23
            goto L5d
        L23:
            boolean r1 = r6.isSynthetic()
            if (r1 == 0) goto L2a
            goto L5d
        L2a:
            java.lang.Class r1 = r6.getType()
            boolean r1 = r0.m12868c(r1)
            if (r1 == 0) goto L35
            goto L5d
        L35:
            if (r7 == 0) goto L3a
            java.util.List<com.google.gson.ExclusionStrategy> r7 = r0.f23695b
            goto L3c
        L3a:
            java.util.List<com.google.gson.ExclusionStrategy> r7 = r0.f23696c
        L3c:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L5f
            com.google.gson.FieldAttributes r0 = new com.google.gson.FieldAttributes
            r0.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L4b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5f
            java.lang.Object r7 = r6.next()
            com.google.gson.ExclusionStrategy r7 = (com.google.gson.ExclusionStrategy) r7
            boolean r7 = r7.m12825a(r0)
            if (r7 == 0) goto L4b
        L5d:
            r6 = 1
            goto L60
        L5f:
            r6 = 0
        L60:
            if (r6 != 0) goto L63
            goto L64
        L63:
            r3 = 0
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.m12931b(java.lang.reflect.Field, boolean):boolean");
    }
}
