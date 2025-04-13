package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
class CollectorBase {
    public final AnnotationIntrospector _intr;
    public static final AnnotationMap[] NO_ANNOTATION_MAPS = new AnnotationMap[0];
    public static final Annotation[] NO_ANNOTATIONS = new Annotation[0];

    public CollectorBase(AnnotationIntrospector annotationIntrospector) {
        this._intr = annotationIntrospector;
    }

    public static AnnotationMap _emptyAnnotationMap() {
        return new AnnotationMap();
    }

    public static AnnotationMap[] _emptyAnnotationMaps(int i2) {
        if (i2 == 0) {
            return NO_ANNOTATION_MAPS;
        }
        AnnotationMap[] annotationMapArr = new AnnotationMap[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            annotationMapArr[i3] = _emptyAnnotationMap();
        }
        return annotationMapArr;
    }

    public static final boolean _ignorableAnnotation(Annotation annotation) {
        return (annotation instanceof Target) || (annotation instanceof Retention);
    }

    public final AnnotationCollector collectAnnotations(Annotation[] annotationArr) {
        AnnotationCollector emptyCollector = AnnotationCollector.emptyCollector();
        for (Annotation annotation : annotationArr) {
            emptyCollector = emptyCollector.addOrOverride(annotation);
            if (this._intr.isAnnotationBundle(annotation)) {
                emptyCollector = collectFromBundle(emptyCollector, annotation);
            }
        }
        return emptyCollector;
    }

    public final AnnotationCollector collectDefaultAnnotations(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!annotationCollector.isPresent(annotation)) {
                annotationCollector = annotationCollector.addOrOverride(annotation);
                if (this._intr.isAnnotationBundle(annotation)) {
                    annotationCollector = collectDefaultFromBundle(annotationCollector, annotation);
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector collectDefaultFromBundle(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : ClassUtil.findClassAnnotations(annotation.annotationType())) {
            if (!_ignorableAnnotation(annotation2) && !annotationCollector.isPresent(annotation2)) {
                annotationCollector = annotationCollector.addOrOverride(annotation2);
                if (this._intr.isAnnotationBundle(annotation2)) {
                    annotationCollector = collectFromBundle(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector collectFromBundle(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : ClassUtil.findClassAnnotations(annotation.annotationType())) {
            if (!_ignorableAnnotation(annotation2)) {
                if (!this._intr.isAnnotationBundle(annotation2)) {
                    annotationCollector = annotationCollector.addOrOverride(annotation2);
                } else if (!annotationCollector.isPresent(annotation2)) {
                    annotationCollector = collectFromBundle(annotationCollector.addOrOverride(annotation2), annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector collectAnnotations(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.addOrOverride(annotation);
            if (this._intr.isAnnotationBundle(annotation)) {
                annotationCollector = collectFromBundle(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }
}
