
---

# 🚗 KMPVeiCore

**KMPVeiCore** é uma biblioteca multiplataforma (Kotlin Multiplatform) para gerenciamento e registro de manutenções de veículos, incluindo carros, motos e outros tipos de transporte.

---

## 📐 Arquitetura

- **Domain**: Regras de negócio e modelos.
- **Data**: Fontes de dados locais e remotos.
- **DI**: Injeção de dependências com Koin.

---

## 🛠️ Tecnologias

- **Kotlin Multiplatform (KMP)**
- **Koin** para injeção de dependências
- **SQLDelight** para persistência

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