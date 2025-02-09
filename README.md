# -Efficient-Data-Processing-Pipeline



# Efficient Data Processing Pipeline


## 📌 Description
Efficient Data Processing Pipeline is a **batch processing system** designed to handle large volumes of data efficiently. It integrates **Spring Batch, Apache Kafka, and MySQL** to process, transform, and store customer data asynchronously.

## 🚀 Problem It Solves
- **Manual data processing is slow** ⏳ → Automates processing using Spring Batch.
- **High latency in data ingestion** → Uses Apache Kafka to process data in real-time.
- **Difficulty in tracking batch jobs** → Logs and monitoring via Prometheus & Grafana.

## 🛠 Tech Stack
- **Java 17**
- **Spring Boot** (Spring Batch, Spring Data JPA, Spring Kafka)
- **Apache Kafka** (Message Queue for Asynchronous Processing)
- **MySQL/PostgreSQL** (Database Storage)
- **Prometheus & Grafana** (Monitoring & Metrics Visualization)
- **Docker & Docker Compose** (Containerization)
- **Offset Explorer** (Kafka Message Debugging)

## ⚙️ Installation & Setup

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/NikhilRajOfficial/Efficient-Data-Pipeline.git
cd Efficient-Data-Pipeline
```

### 2️⃣ Start Kafka & Zookeeper
If using Docker, run:
```bash
docker-compose up -d
```

If running manually, start Zookeeper first:
```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
```
Then start Kafka:
```bash
bin/kafka-server-start.sh config/server.properties
```

### 3️⃣ Configure the Database (MySQL)
```sql
CREATE DATABASE springbatch;
```
Update `application.properties` with your DB credentials.

### 4️⃣ Build & Run the Application
```bash
mvn clean install
mvn spring-boot:run
```

## 🏗 Architecture Diagram
![Architecture Diagram](images/architecture.png)

## 🛠 How It Works
1. **Data Ingestion:** A CSV file containing customer records is read using Spring Batch.
2. **Data Transformation:** Customer data is validated and transformed.
3. **Data Processing:** Processed data is pushed to Kafka.
4. **Asynchronous Consumer:** Kafka consumer listens and inserts data into MySQL.
5. **Monitoring & Logging:** Logs are visualized using Prometheus & Grafana.

## 📡 API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| POST   | `/jobs/importCustomers` | Triggers the batch job |
| GET    | `/customers` | Fetch processed customer records |

## 🖼 Screenshots

### Batch Job Execution Log
![Batch Job Logs]([images/job_logs.png](https://github.com/NikhilRajOfficial/-Efficient-Data-Processing-Pipeline/blob/2792fcd67863a034240275feb0f5a51c0ecb8458/Screenshot%202025-02-09%20120803.png))

## 🤝 Contributing
1. **Fork the Repository**
2. **Create a Feature Branch:**
   ```bash
   git checkout -b feature-name
   ```
3. **Commit Changes & Push:**
   ```bash
   git commit -m "Added new feature"
   git push origin feature-name
   ```
4. **Create a Pull Request**

## 📜 License
This project is licensed under the **MIT License**.

---
🔗 **Connect with Me**
- 📧 Email: nikhilraj2277@gmail.com  
- 💼 LinkedIn: [Nikhil Raj](https://www.linkedin.com/in/nikhilraj620/)  
- 💻 GitHub: [NikhilRajOfficial](https://github.com/NikhilRajOfficial)

