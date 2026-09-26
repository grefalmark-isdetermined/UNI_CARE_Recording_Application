import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract class QueueTicket extends BasedRecord {
    // Reusable formatter to avoid creating a new object on every method call
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private String ticketId, studentId, service, queueNumber, status, checkInTime;
    private final LocalDateTime timestamp;

    public QueueTicket(String ticketId, String studentId, String service, String queueNumber) {
        
        this.ticketId = ticketId;
        this.studentId = studentId;
        this.service = service;
        this.queueNumber = queueNumber;
        this.status = "WAITING"; // Default status upon creation
        this.timestamp = LocalDateTime.now();
        this.checkInTime = getFormattedTimestamp(); // Automatically syncs checkInTime with timestamp
    }

    // Getters
    public String getTicketId() { return ticketId; }
    public String getStudentId() { return studentId; }
    public String getService() { return service; }
    public String getQueueNumber() { return queueNumber; }
    public String getStatus() { return status; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getCheckInTime() { return checkInTime; }

    public String getFormattedTimestamp() {
        return this.timestamp.format(FORMATTER);
    }

    // Setters
    public void setStatus(String status) { this.status = status; }
    public void setQueueNumber(String queueNumber) { this.queueNumber = queueNumber; }
    public void setService(String service) { this.service = service; }

    
    //Abstract methods 
    abstract String toFileString();
    abstract File fromFileString();
}