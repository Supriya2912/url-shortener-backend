# URL Shortener Backend Service 🔗

A scalable RESTful backend service built with **Java** and **Spring Boot** that shortens long URLs into compact, shareable links.

## 🛠️ Tech Stack
- **Java 17**
- **Spring Boot 3.5**
- **Spring Data JPA**
- **H2 In-Memory Database**
- **Swagger/OpenAPI 3.0**
- **Docker**
- **Maven**

## 🏗️ Architecture
Follows a clean **Layered Architecture**:
```
Controller → Service → Repository → Database
```

## 🚀 Features
- ✅ Shorten any long URL into a 6-character code
- ✅ Retrieve original URL using short code
- ✅ RESTful API design
- ✅ API documentation with Swagger UI
- ✅ Containerized with Docker
- ✅ In-memory database with H2

## 📋 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/shorten` | Shorten a long URL |
| GET | `/api/{shortCode}` | Get original URL |

## 🧪 Sample Request

### Shorten a URL:
```json
POST /api/shorten
{
  "originalUrl": "https://www.google.com"
}
```

### Response:
```json
{
  "id": 1,
  "originalUrl": "https://www.google.com",
  "shortCode": "74cdf8"
}
```

## 🖥️ Run Locally

### Prerequisites:
- Java 17
- Maven

### Steps:
```bash
git clone https://github.com/Supriya2912/url-shortener-backend.git
cd url-shortener-backend
mvn spring-boot:run
```

### Access Swagger UI:
```
http://localhost:8080/swagger-ui.html
```

## 🐳 Run with Docker
```bash
docker build -t url-shortener .
docker run -p 8080:8080 url-shortener
```

## 👩‍💻 Author
**Supriya Biradar**
- GitHub: [@Supriya2912](https://github.com/Supriya2912)
- LinkedIn: [Supriya Biradar](https://linkedin.com/in/your-profile)