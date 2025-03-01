
---

#  KMPVeiCore

**KMPVeiCore** é uma biblioteca multiplataforma (Kotlin Multiplatform) para gerenciamento e registro de manutenções de veículos, incluindo carros, motos e outros tipos de transporte.

---

## 📂 Estrutura Básica

```
shared/
├── src/
│   ├── commonMain/
│   │   ├── domain/
│   │   ├── data/
│   │   ├── di/
│   │   └── utils/
│   ├── androidMain/
│   ├── iosMain/
│   └── ...
```

---

## 📦 Publicação Local

Para publicar no Maven Local (para testes):

```bash
./gradlew publishToMavenLocal
```

---
